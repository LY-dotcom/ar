package com.wpz.ar.service;

import com.wpz.ar.domain.Manager;

public interface ManagerService {
    Manager login(Manager manager);

    Manager getManager(Manager manager);
}
