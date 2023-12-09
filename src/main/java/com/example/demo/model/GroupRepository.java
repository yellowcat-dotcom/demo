package com.example.demo.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GroupRepository {
    private List<Group> groups = new ArrayList<>();

    public List<Group> findAll() {
        return groups;
    }

    public Group findById(String codeDirection, String faculty, String numberGroup) {
        return groups.stream()
                .filter(group -> group.getCodeDirection().equals(codeDirection)
                        && group.getFaculty().equals(faculty)
                        && group.getNumberGroup().equals(numberGroup))
                .findFirst().orElse(null);
    }

    public void save(Group group) {
        groups.add(group);
    }

    public void update(Group group) {
        int index = findGroupIndexById(group.getCodeDirection(), group.getFaculty(), group.getNumberGroup());
        if (index != -1) {
            groups.set(index, group);
        }
    }

    public void delete(String codeDirection, String faculty, String numberGroup) {
        groups.removeIf(group -> group.getCodeDirection().equals(codeDirection)
                && group.getFaculty().equals(faculty)
                && group.getNumberGroup().equals(numberGroup));
    }

    // Дополнительный метод для поиска индекса группы по коду направления, факультету и номеру группы
    private int findGroupIndexById(String codeDirection, String faculty, String numberGroup) {
        for (int i = 0; i < groups.size(); i++) {
            Group group = groups.get(i);
            if (group.getCodeDirection().equals(codeDirection)
                    && group.getFaculty().equals(faculty)
                    && group.getNumberGroup().equals(numberGroup)) {
                return i;
            }
        }
        return -1;
    }
}
