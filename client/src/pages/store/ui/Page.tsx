import { StoreSearch } from '@/features/StoreSearch';
import { ProductsList } from '@/widgets/ProductsList';

export const StorePage: React.FC = () => {
	return (
		<>
			<StoreSearch />
			<ProductsList />
		</>
	);
};
