import { ProductCard } from '@/entities';
import { IProductGridProps } from '../model/interfaces';
import './styles.scss';

export const ProductsGrid: React.FC<IProductGridProps> = ({ products }) => {
	return (
		<div className='wrapper'>
			{products.map(product => (
				<ProductCard
					key={product.id}
					image={product.image}
					name={product.title}
					price={product.price}
				/>
			))}
		</div>
	);
};
