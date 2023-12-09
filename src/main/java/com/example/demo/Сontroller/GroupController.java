package com.example.demo.Сontroller;

import com.example.demo.model.Group;
import com.example.demo.model.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/groups")
public class GroupController {
    @Autowired
    private GroupService groupService;

    // Получить все группы
    @GetMapping
    public List<Group> getAllGroups() {
        return groupService.getAllGroups();
    }

    // Получить группу по коду направления, факультету и номеру группы
    @GetMapping("/{codeDirection}/{faculty}/{numberGroup}")
    public Group getGroupById(
            @PathVariable String codeDirection,
            @PathVariable String faculty,
            @PathVariable String numberGroup) {
        return groupService.getGroupById(codeDirection, faculty, numberGroup);
    }

    // Добавить новую группу
    @PostMapping
    public void addGroup(@RequestBody Group group) {
        groupService.addGroup(group);
    }

    // Обновить информацию о группе
    @PutMapping("/{codeDirection}/{faculty}/{numberGroup}")
    public void updateGroup(
            @PathVariable String codeDirection,
            @PathVariable String faculty,
            @PathVariable String numberGroup,
            @RequestBody Group group) {
        group.setCodeDirection(codeDirection);
        group.setFaculty(faculty);
        group.setNumberGroup(numberGroup);
        groupService.updateGroup(group);
    }

    // Удалить группу по коду направления, факультету и номеру группы
    @DeleteMapping("/{codeDirection}/{faculty}/{numberGroup}")
    public void deleteGroup(
            @PathVariable String codeDirection,
            @PathVariable String faculty,
            @PathVariable String numberGroup) {
        groupService.deleteGroup(codeDirection, faculty, numberGroup);
    }
}
