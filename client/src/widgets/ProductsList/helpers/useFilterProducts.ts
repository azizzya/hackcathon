import { IProduct } from '../model/interfaces';

export function useFilterProducts(products: IProduct[], search: string) {
	return products.filter(product =>
		product.title.toLowerCase().includes(search.toLowerCase())
	);
}
