/*
 * #%L
 * metasfresh-material-dispo-commons
 * %%
 * Copyright (C) 2021 metas GmbH
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

package de.metas.document.dimension;

import de.metas.material.dispo.model.I_MD_Candidate;
import de.metas.order.OrderId;
import de.metas.product.acct.api.ActivityId;
import de.metas.project.ProjectId;
import lombok.NonNull;
import org.springframework.stereotype.Component;

@Component
public class MDCandidateDimensionFactory implements DimensionFactory<I_MD_Candidate>
{
	@Override
	public String getHandledTableName()
	{
		return I_MD_Candidate.Table_Name;
	}

	@Override
	@NonNull
	public Dimension getFromRecord(@NonNull final I_MD_Candidate record)
	{
		return Dimension.builder()
				.projectId(ProjectId.ofRepoIdOrNull(record.getC_Project_ID()))
				.campaignId(record.getC_Campaign_ID())
				.activityId(ActivityId.ofRepoIdOrNull(record.getC_Activity_ID()))
				.salesOrderId(OrderId.ofRepoIdOrNull(record.getC_OrderSO_ID()))
				.userElementString1(record.getUserElementString1())
				.userElementString2(record.getUserElementString2())
				.userElementString3(record.getUserElementString3())
				.userElementString4(record.getUserElementString4())
				.userElementString5(record.getUserElementString5())
				.userElementString6(record.getUserElementString6())
				.userElementString7(record.getUserElementString7())
				.build();
	}

	@Override
	public void updateRecord(@NonNull final I_MD_Candidate record, @NonNull final Dimension from)
	{
		record.setC_Project_ID(ProjectId.toRepoId(from.getProjectId()));
		record.setC_Campaign_ID(from.getCampaignId());
		record.setC_Activity_ID(ActivityId.toRepoId(from.getActivityId()));
		record.setC_OrderSO_ID(OrderId.toRepoId(from.getSalesOrderId()));

		updateRecordUserElements(record, from);
	}

	@Override
	public void updateRecordUserElements(@NonNull final I_MD_Candidate record,@NonNull final Dimension from)
	{
		record.setUserElementString1(from.getUserElementString1());
		record.setUserElementString2(from.getUserElementString2());
		record.setUserElementString3(from.getUserElementString3());
		record.setUserElementString4(from.getUserElementString4());
		record.setUserElementString5(from.getUserElementString5());
		record.setUserElementString6(from.getUserElementString6());
		record.setUserElementString7(from.getUserElementString7());
	}
}

