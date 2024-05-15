import { BackArrowButton } from '@/features/BackArrowButton';
import { StoreBalance } from '@/features/StoreBalance';
import { ShoppingCartSVGComponent } from '@/shared/ui/SVGs/ShoppingCart.SVG.Component';
import './styles.scss';
export const StoreHeader: React.FC = () => {
	return (
		<div className='store-header'>
			<div className="store-header-item">
				<div className='store-header-item-arrow'>
					<BackArrowButton />
				</div>
				<h1 className='primary-title'>Маркет</h1>
			</div>
			<div className='store-header-item'>
				<div className='store-header-item-balance'>
					<StoreBalance balance={2190}/>
				</div>
				<div className='store-header-item-cart'>
					<ShoppingCartSVGComponent width='26px' height='24px' />
				</div>
			</div>
		</div>
	);
};
