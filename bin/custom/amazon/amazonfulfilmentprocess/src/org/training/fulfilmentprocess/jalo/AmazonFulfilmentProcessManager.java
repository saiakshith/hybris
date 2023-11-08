/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.training.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.training.fulfilmentprocess.constants.AmazonFulfilmentProcessConstants;

public class AmazonFulfilmentProcessManager extends GeneratedAmazonFulfilmentProcessManager
{
	public static final AmazonFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (AmazonFulfilmentProcessManager) em.getExtension(AmazonFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
