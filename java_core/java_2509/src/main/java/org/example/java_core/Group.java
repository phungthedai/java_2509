package org.example.java_core;

import java.util.Objects;

public class Group {
    int groupId;
    String groupName;
    Account creatorId;
    String createDate;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return groupId == group.groupId
                && Objects.equals(groupName, group.groupName)
                && Objects.equals(creatorId, group.creatorId)
                && Objects.equals(createDate, group.createDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, groupName, creatorId, createDate);
    }
}
