/**
 * Created on Oct 31, 2007
 * Created by Thies Edeling
 * Created by Thies Edeling
 * Copyright (C) 2007 TE-CON, All Rights Reserved.
 *
 * This Software is copyright TE-CON 2007. This Software is not open source by definition. The source of the Software is available for educational purposes.
 * TE-CON holds all the ownership rights on the Software.
 * TE-CON freely grants the right to use the Software. Any reproduction or modification of this Software, whether for commercial use or open source,
 * is subject to obtaining the prior express authorization of TE-CON.
 * 
 * thies@te-con.nl
 * TE-CON
 * Legmeerstraat 4-2h, 1058ND, AMSTERDAM, The Netherlands
 *
 */

package net.rrm.ehour.ui.page.report;

import static org.easymock.EasyMock.eq;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.isA;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import net.rrm.ehour.report.criteria.ReportCriteria;
import net.rrm.ehour.report.criteria.ReportCriteriaUpdate;
import net.rrm.ehour.ui.page.report.global.GlobalReportPage;



/**
 * TODO 
 **/

public class ReportPageTest extends BaseTestReport
{
	public void testReportPageRender()
	{
		expect(reportCriteriaService.syncUserReportCriteria(isA(ReportCriteria.class), eq(ReportCriteriaUpdate.UPDATE_ALL)))
			.andReturn(reportCriteria);
		
		replay(reportCriteriaService);
		
		tester.startPage(GlobalReportPage.class);
		tester.assertRenderedPage(GlobalReportPage.class);
		tester.assertNoErrorMessage();
		
		verify(reportCriteriaService);
	}
}
