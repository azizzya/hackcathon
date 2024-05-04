import { IProduct } from '../interfaces/product.interfaces';
import instance from './axios.api';

class StoreService {
	async getall() {
		return instance.get<IProduct[]>('/store/items');
	}
}

export const storeService = new StoreService();
