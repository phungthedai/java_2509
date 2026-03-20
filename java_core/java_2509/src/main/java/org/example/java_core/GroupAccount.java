package org.example.java_core;

import java.util.Arrays;
import java.util.Objects;

public class GroupAccount {
    Group groupId;
    Account[] accountId;
    String joinDate;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GroupAccount that = (GroupAccount) o;
        return Objects.equals(groupId, that.groupId)
                && Objects.deepEquals(accountId, that.accountId)
                && Objects.equals(joinDate, that.joinDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, Arrays.hashCode(accountId), joinDate);
    }
}
