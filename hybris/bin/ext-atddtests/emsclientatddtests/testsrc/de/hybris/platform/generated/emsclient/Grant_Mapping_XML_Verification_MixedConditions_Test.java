/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.generated.emsclient;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.core.Registry;
import de.hybris.platform.atddengine.framework.RobotSettings;
import de.hybris.platform.atddengine.framework.RobotTest;
import de.hybris.platform.atddengine.framework.RobotTestResult;
import de.hybris.platform.atddengine.framework.RobotTestSuite;
import de.hybris.platform.atddengine.framework.RobotTestSuiteFactory;
import de.hybris.platform.atddengine.framework.impl.DefaultPythonProvider;
import de.hybris.platform.atddengine.framework.impl.PythonAware;
import de.hybris.platform.atddengine.framework.impl.PythonRobotTestSuiteFactory;
import de.hybris.platform.atddengine.keywords.ImpExAdaptorAware;
import de.hybris.platform.atddengine.keywords.KeywordLibraryContext;
import de.hybris.platform.atddengine.keywords.KeywordLibraryContextHolder;
import de.hybris.platform.atddengine.keywords.RobotTestContext;
import de.hybris.platform.atddengine.keywords.RobotTestContextAware;
import de.hybris.platform.atddengine.keywords.impl.DefaultImpExAdaptor;
import de.hybris.platform.servicelayer.ServicelayerTest;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.util.Config;

import java.io.File;
import java.io.IOException;

import javax.annotation.Resource;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;


/*
 * This is a generated class. Do not edit, changes will be overriden.
 */
@SuppressWarnings("PMD")
@IntegrationTest
public class Grant_Mapping_XML_Verification_MixedConditions_Test extends ServicelayerTest implements RobotTestContext
{
	public static RobotTestSuite robotTestSuite;
	
	private ModelService modelService;

	public static void startSuite() throws IOException
	{
		if (robotTestSuite == null)
		{
			final PythonAware pythonAware = new DefaultPythonProvider(Config.getParameter("atddengine.libraries-path"));

			final RobotSettings robotSettings = new RobotSettings();
			
			robotSettings.setOutputDir(new File(Config.getParameter("atddengine.report-path"), "emsclient"));
			robotSettings.setLogName("Grant_Mapping_XML_Verification_MixedConditions_Test-log");
			robotSettings.setOutputName("Grant_Mapping_XML_Verification_MixedConditions_Test-output");
			robotSettings.setReportName("Grant_Mapping_XML_Verification_MixedConditions_Test-report");
			
			final RobotTestSuiteFactory robotTestSuiteFactory = new PythonRobotTestSuiteFactory(pythonAware);

			robotTestSuite = robotTestSuiteFactory.parseTestSuite(robotSettings, new File(
					"/opt/bambooagent/xml-data/build-dir/CI-CI630-PREP/maintenance/bin/ext-atddtests/emsclientatddtests/genresources/robottests/Grant_Mapping_XML_Verification_MixedConditions_Test.txt"));
		}

		if (!robotTestSuite.isStarted())
		{
			robotTestSuite.start();
		}

	}

	@AfterClass
	public static void tearDownSuite()
	{
		robotTestSuite.close();
	}

	private RobotTest currentRobotTest;

	@Resource(name = "impExAdaptorHolder")
	private ImpExAdaptorAware impExAdaptorHolder;

	@Resource(name = "keywordLibraryContext")
	private KeywordLibraryContext keywordLibraryContext;

	@Resource(name = "robotTestContextHolder")
	private RobotTestContextAware robotTestContextHolder;

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hybris.platform.atddengine.keywords.RobotTestContext#getCurrentRobotTest()
	 */
	@Override
	public RobotTest getCurrentRobotTest()
	{
		return currentRobotTest;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hybris.platform.atddengine.keywords.RobotTestContext#getProjectName()
	 */
	@Override
	public String getProjectName()
	{
		return "emsclient";
	}

	@Before
	public void setUp() throws IOException
	{
		impExAdaptorHolder.setImpExAdaptor(new DefaultImpExAdaptor());
		
		robotTestContextHolder.setRobotTestContext(this);

		KeywordLibraryContextHolder.setKeywordLibraryContext(keywordLibraryContext);
		
		modelService = (ModelService)Registry.getApplicationContext().getBean("modelService");

		startSuite();
	}
	
	@Test
	public void Test_Grant_Mapping_XML_Verification_AllConditions()
	{
		modelService.detachAll();
		
		final String robotTestName = "Test_Grant_Mapping_XML_Verification_AllConditions";
		
		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);
		
		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}
	

}
