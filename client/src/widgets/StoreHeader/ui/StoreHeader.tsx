import { BackArrowButton } from '@/features/BackArrowButton';
import { StoreBalance } from '@/features/StoreBalance';
import { ShoppingCartSVGComponent } from '@/shared/ui/SVGs/ShoppingCart.SVG.Component';
import './styles.scss';
export const StoreHeader: React.FC = () => {
	return (
		<div className='store-header-grid'>
			<div className='store-header-grid-item'>
				<div className='store-header-grid-item-arrow'>
					<BackArrowButton />
				</div>
			</div>
			<div className='store-header-grid-item-text'>
				<div className='primary-title'>Маркет</div>
			</div>
			<div className='store-header-grid-item'>
				<div className='store-header-grid-item-features '>
					<div className='store-header-grid-item-features-balance'>
						<StoreBalance />
					</div>
					<div className='store-header-grid-item-features-img'>
						<ShoppingCartSVGComponent width='100%' height='100%' />
					</div>
				</div>
			</div>
		</div>
	);
};
