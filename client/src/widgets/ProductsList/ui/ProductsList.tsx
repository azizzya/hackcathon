import { useStoreSearchStore } from '@/shared/stores/StoreSearch.store';
import { useFilterProducts } from '../helpers/useFilterProducts';

import { useProducts } from '@/entities/product';
import { ProductsGrid } from './ProductsGrid';

export const ProductsList: React.FC = () => {
	const { data } = useProducts();

	const { search } = useStoreSearchStore();

	return (
		<div className='products-grid-wrapper'>
			{data ? (
				<ProductsGrid products={useFilterProducts(data.data, search)} />
			) : (
				<div>error</div>
			)}
		</div>
	);
};
