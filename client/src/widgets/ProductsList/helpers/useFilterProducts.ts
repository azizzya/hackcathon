import { IProduct } from '@/shared/interfaces/product.interfaces';

export function useFilterProducts(products: IProduct[], search: string) {
	return products.filter(product =>
		product.name.toLowerCase().includes(search.toLowerCase())
	);
}
