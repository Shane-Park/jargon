package org.irods.jargon.ticket.unittest;

import org.irods.jargon.ticket.TicektServiceFactoryImplTest;
import org.irods.jargon.ticket.TicketAdminServiceImplTest;
import org.irods.jargon.ticket.TicketClientOperationsImplTest;
import org.irods.jargon.ticket.TicketDistributionServiceImplTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ TicketAdminServiceImplTest.class, TicketClientOperationsImplTest.class,
		TicektServiceFactoryImplTest.class, TicketDistributionServiceImplTest.class })
/**
 * Suite to run all tests (except long running and functional), further refined
 * by settings in testing.properites. Some subtests may be shut off by these
 * properties.
 */
public class AllTests {

}
