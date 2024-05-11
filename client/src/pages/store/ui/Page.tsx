import { StoreSearch } from '@/features/StoreSearch';
import { ProductsList } from '@/widgets/ProductsList';
import { StoreHeader } from '@/widgets/StoreHeader';

export const StorePage: React.FC = () => {
	return (
		<>
			<StoreHeader />
			<StoreSearch />
			<ProductsList />
		</>
	);
};
