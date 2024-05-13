import { StoreSearch } from '@/features/StoreSearch';
import { ProductsList } from '@/widgets/ProductsList';
import { StoreHeader } from '@/widgets/StoreHeader';
import './styles.scss';
export const StorePage: React.FC = () => {
	return (
		<div className='store-wrapper'>
			<StoreHeader />
			<StoreSearch />
			<ProductsList />
		</div>
	);
};
