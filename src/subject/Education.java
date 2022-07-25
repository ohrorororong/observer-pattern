package subject;

import java.time.LocalDateTime;

public class Education {
    private String name;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Education(String name, LocalDateTime startTime, LocalDateTime endTime) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
