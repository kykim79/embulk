package org.embulk.config;

public interface Task
{
    public void validate();
    // TODO public void validateConfig();
    // ConfigSource.loadTask calls validateConfig and it validates only fields that have Config annotation

    public TaskSource dump();
}
