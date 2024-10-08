/*
 * #%L
 * de.metas.cucumber
 * %%
 * Copyright (C) 2022 metas GmbH
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

package de.metas.cucumber.stepdefs;

import de.metas.util.lang.RepoIdAware;
import de.metas.util.lang.RepoIdAwares;
import lombok.NonNull;

import java.util.Optional;

public class IdentifierIds_StepDefData extends StepDefData<Integer>
{
	public IdentifierIds_StepDefData()
	{
		super(null);
	}

	public <T extends RepoIdAware> Optional<T> getOptional(@NonNull final String identifier, @NonNull final Class<T> type)
	{
		return getOptional(StepDefDataIdentifier.ofString(identifier), type);
	}

	public <T extends RepoIdAware> Optional<T> getOptional(@NonNull final StepDefDataIdentifier identifier, @NonNull final Class<T> type)
	{
		return getOptional(identifier).map(valueInt -> RepoIdAwares.ofRepoId(valueInt, type));
	}

}
