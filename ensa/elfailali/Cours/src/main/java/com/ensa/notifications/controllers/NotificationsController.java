package com.ensa.notifications.controllers;


import com.ensa.notifications.dto.CoursDto;
import com.ensa.notifications.models.Cours;
import com.ensa.notifications.services.CoursService;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/notifications")
@AllArgsConstructor
public class NotificationsController {

    private final CoursService coursService;

    @RequestMapping(method = RequestMethod.GET)
//    find courses
    public List<Cours> findAll() {
        return coursService.getNotifications();
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Cours> createNotification(@RequestBody() CoursDto dto) {
        return ResponseEntity.ok(this.coursService.createNotification(dto));
    }

    @RequestMapping(value = "{notificationId}", method = RequestMethod.DELETE)
    public void deleteNotification(@PathVariable() String notificationId){
        coursService.deleteNotification(notificationId);
    }
}