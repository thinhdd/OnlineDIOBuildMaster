package com.qsoft.pilotproject.common.utils;

/**
 * User: Le
 * Date: 11/4/13
 */
public class UniqueRequestCodeGenerator // Simple
{
    private static int currentUniqueRequestCode = 1000;

    public static int getNext()
    {
        return currentUniqueRequestCode++;
    }
}
