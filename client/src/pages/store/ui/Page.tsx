import { StoreSearch } from '@/features/StoreSearch';
import { ProductsList } from '@/widgets/ProductsList';
import { StoreHeader } from '@/widgets/StoreHeader';

export const StorePage: React.FC = () => {
	return (
		<div className='page-wrapper'>
			<StoreHeader />
			<StoreSearch />
			<ProductsList />
		</div>
	);
};
