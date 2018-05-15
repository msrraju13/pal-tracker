package io.pivotal.pal.tracker;

import java.util.List;


public interface TimeEntryRepository {
    TimeEntry find(Long id);
    List<TimeEntry> list();
    TimeEntry update(long id, TimeEntry timeEntry);
    void delete(long id);
    TimeEntry create(TimeEntry any);

}
