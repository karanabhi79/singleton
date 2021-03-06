/*
 * Copyright 2019 VMware, Inc.
 * SPDX-License-Identifier: EPL-2.0
 */
package com.vmware.i18n.l2.service.locale;

import java.util.List;

public interface ILocaleService {

	public List<DisplayLanguageDTO> getDisplayNamesFromCLDR(String productName, String version, String displayLanguage) throws Exception;

	public List<TerritoryDTO> getTerritoriesFromCLDR(String languageList) throws Exception;
}
