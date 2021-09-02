package se331.lab.rest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import se331.lab.rest.entity.Organizer;
import se331.lab.rest.repository.OrganizerRepository;

@Component
public class InitAppOrganizer implements ApplicationListener<ApplicationReadyEvent> {
    @Autowired
    OrganizerRepository organizerRepository;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        organizerRepository.save(Organizer.builder()
                .organizationName("CAMT")
                .address("CAMT Building")
                .build());
        organizerRepository.save(Organizer.builder()
                .organizationName("CMU")
                .address("CAMT Convention hall")
                .build());
        organizerRepository.save(Organizer.builder()
                .organizationName("Chiang Mai")
                .address("Ping River")
                .build());
        organizerRepository.save(Organizer.builder()
                .organizationName("Chiang Mai Municipality")
                .address("Chaing Mai Moat")
                .build());
    }
}
