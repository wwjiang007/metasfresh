/*
 * #%L
 * de.metas.adempiere.adempiere.base
 * %%
 * Copyright (C) 2024 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

package de.metas.contracts;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import de.metas.util.Check;
import de.metas.util.lang.RepoIdAware;
import lombok.Value;

import javax.annotation.Nullable;

@Value
public class ModularContractSettingsId implements RepoIdAware
{
	int repoId;

	@JsonCreator
	public static ModularContractSettingsId ofRepoId(final int repoId)
	{
		return new ModularContractSettingsId(repoId);
	}

	@Nullable
	public static ModularContractSettingsId ofRepoIdOrNull(@Nullable final Integer repoId)
	{
		return repoId != null && repoId > 0 ? new ModularContractSettingsId(repoId) : null;
	}

	private ModularContractSettingsId(final int repoId)
	{
		this.repoId = Check.assumeGreaterThanZero(repoId, "modularContractSettingsId");
	}

	public static int toRepoId(@Nullable final ModularContractSettingsId modularContractSettingsId)
	{
		return toRepoIdOr(modularContractSettingsId, -1);
	}

	public static int toRepoIdOr(@Nullable final ModularContractSettingsId modularContractSettingsId, final int defaultValue)
	{
		return modularContractSettingsId != null ? modularContractSettingsId.getRepoId() : defaultValue;
	}

	@Override
	@JsonValue
	public int getRepoId()
	{
		return repoId;
	}
}
