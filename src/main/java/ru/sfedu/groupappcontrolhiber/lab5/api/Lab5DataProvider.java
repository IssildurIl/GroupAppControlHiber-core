package ru.sfedu.groupappcontrolhiber.lab5.api;

import ru.sfedu.groupappcontrolhiber.Result;
import ru.sfedu.groupappcontrolhiber.lab5.models.Project;
import ru.sfedu.groupappcontrolhiber.lab5.models.Task;

public interface Lab5DataProvider {
    Result<Project> getTaskById(long id);
}
