package com.ensa.notifications.services;

import com.ensa.notifications.dto.CoursDto;


import com.ensa.notifications.models.Cours;
import com.ensa.notifications.repos.CoursRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CoursService {
    private final CoursRepo coursRepo;

    public List<Cours> getNotifications() {
        return coursRepo.findAll();
    }

    public Cours createNotification(CoursDto dto) {
        Cours notification = Cours.builder()
                .Name(dto.getName())

                .build();
        coursRepo.saveAndFlush(notification);
        return  notification;
    }

    public void deleteNotification(String notificationId){
        coursRepo.deleteById(notificationId);
    }
}
