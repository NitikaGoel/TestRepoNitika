/**************************************************************
 * Copyright (C) 2011 Marks And Spencer, All Rights Reserved
 * Description: This is the base controller command for getting order items for an order.
 * Name: com.mns.commerce.catalog.commands.ControllerCommand.java
 * @author sapient
 * Date: Sep 19, 2013
 **************************************************************/
package com.mns.commerce.catalog.commands;

import com.ibm.commerce.command.ControllerCommand;
import com.ibm.commerce.exception.ECException;

/**
 * This is the base controller command for getting order items for an order.
 * @author sapient
 *
 */
public interface MSContactUsOrderDetailsCmd extends ControllerCommand {
    /** The defaultCommandClassName field. */
    String defaultCommandClassName = MSContactUsOrderDetailsCmdImpl.class.getName();

    @Override
    void performExecute()
            throws ECException;

}
