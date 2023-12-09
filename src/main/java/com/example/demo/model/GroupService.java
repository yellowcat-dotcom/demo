package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {
    @Autowired
    private GroupRepository groupRepository;

    public List<Group> getAllGroups() {
        return groupRepository.findAll();
    }

    public Group getGroupById(String codeDirection, String faculty, String numberGroup) {
        return groupRepository.findById(codeDirection, faculty, numberGroup);
    }

    public void addGroup(Group group) {
        groupRepository.save(group);
    }

    public void updateGroup(Group group) {
        groupRepository.update(group);
    }

    public void deleteGroup(String codeDirection, String faculty, String numberGroup) {
        groupRepository.delete(codeDirection, faculty, numberGroup);
    }
}
