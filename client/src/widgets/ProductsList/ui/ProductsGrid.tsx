import { ProductCard } from '@/entities';
import image from '@/shared/assets/gifs/small-dancing-white-cat-dance-funny.gif';
import { IProductGridProps } from '../model/interfaces';
import './styles.scss';

export const ProductsGrid: React.FC<IProductGridProps> = ({ products }) => {
	return (
		<div className='wrapper'>
			{products.map(product => (
				<ProductCard
					key={product.item_id}
					image={image}
					name={product.name}
					price={product.price}
				/>
			))}
		</div>
	);
};
