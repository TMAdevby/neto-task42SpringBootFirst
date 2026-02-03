package ru.netology.netotask42springbootfirst.realization;

import ru.netology.netotask42springbootfirst.interf.SystemProfile;

public class DevProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is dev";
    }
}
