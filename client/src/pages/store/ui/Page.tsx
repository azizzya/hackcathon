import { StoreSearch } from '@/features/StoreSearch';
import { NavBar } from '@/widgets/navBar';
import { ProductsList } from '@/widgets/ProductsList';

export const StorePage: React.FC = () => {
	return (
		<>
			<StoreSearch />
			<ProductsList />
			<NavBar />
		</>
	);
};
