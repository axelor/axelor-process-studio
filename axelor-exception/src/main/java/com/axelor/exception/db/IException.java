/**
 * Axelor Business Solutions
 *
 * Copyright (C) 2017 Axelor (<http://axelor.com>).
 *
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.axelor.exception.db;

/**
 * Interface of Exception package. Enum all static variable of packages.
 * 
 * @author belloy
 * 
 */
public interface IException {
	
	/**
	 * Type select
	 */
	public static final int TECHNICAL = 0;
	public static final int FUNCTIONNAL = 1;
	
	/**
	 * Category select
	 */
	public static final int MISSING_FIELD = 1;
	public static final int NO_UNIQUE_KEY = 2;
	public static final int NO_VALUE = 3;
	public static final int CONFIGURATION_ERROR = 4;
	public static final int INCONSISTENCY = 5;
	
	/**
	 * Origin select
	 */
	public static final String INVOICE_ORIGIN = "invoice";
	public static final String REMINDER = "reminder";
	public static final String DOUBTFUL_CUSTOMER = "doubtfulCustomer";
	public static final String REIMBURSEMENT = "reimbursement";
	public static final String DIRECT_DEBIT = "directDebit";
	public static final String ACCOUNT_CUSTOMER = "accountCustomer";
	public static final String MOVE_LINE_EXPORT_ORIGIN = "moveLineExport";
	public static final String IRRECOVERABLE = "irrecoverable";
	public static final String CRM = "crm";
	public static final String IMPORT = "import";
	public static final String LEAVE_MANAGEMENT = "leaveManagement";
	public static final String BANK_STATEMENT = "bankStatement";
    public static final String CREDIT_TRANSFER = "creditTransfer";
	
}
