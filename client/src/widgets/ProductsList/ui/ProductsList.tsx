import { useStoreSearchStore } from '@/shared/stores/StoreSearch.store';
import { useEffect } from 'react';
import { useFilterProducts } from '../helpers/useFilterProducts';
import { useProducts } from '../helpers/useProducts';
import { ProductsGrid } from './ProductsGrid';

export const ProductsList: React.FC = () => {
	const data = useProducts();

	const { search } = useStoreSearchStore();

	useEffect(() => {}, [data]);

	return data ? (
		<ProductsGrid products={useFilterProducts(data.data, search)} />
	) : (
		<div>error</div>
	);
};
