/*
 * #%L
 * ic114
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

import axios from 'axios';
import { unboxAxiosResponse } from '../../utils';
import { apiBasePath } from '../../constants';

const worspaceAPIBase = `${apiBasePath}/workplace`;

export const getWorkplaceByQRCode = (qrCode) => {
  return axios.post(`${worspaceAPIBase}/byQRCode`, { qrCode }).then(unboxAxiosResponse);
};

export const assignWorkplace = (workplaceId) => {
  return axios.post(`${apiBasePath}/workplace/${workplaceId}/assign`).then(unboxAxiosResponse);
};
