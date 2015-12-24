/**
 * Copyright 2014-2015 yangming.liu<liuyangming@gmail.com>.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, see <http://www.gnu.org/licenses/>.
 */
package org.bytesoft.transaction;

import javax.transaction.TransactionManager;

import org.bytesoft.bytejta.wire.TransactionManagerSkeleton;
import org.bytesoft.transaction.supports.TransactionTimer;
import org.bytesoft.transaction.supports.logger.TransactionLogger;
import org.bytesoft.transaction.supports.rpc.TransactionInterceptor;
import org.bytesoft.transaction.xa.XidFactory;

public interface TransactionBeanFactory {

	public TransactionManager getTransactionManager();

	public XidFactory getXidFactory();

	public TransactionTimer getTransactionTimer();

	public <T> TransactionRepository<T> getTransactionRepository();

	public TransactionInterceptor getTransactionInterceptor();

	public TransactionRecovery getTransactionRecovery();

	public TransactionManagerSkeleton getTransactionManagerSkeleton();

	public TransactionLogger getTransactionLogger();

}