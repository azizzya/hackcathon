import { ProductCard } from '@/entities';
import { useEffect, useState } from 'react';
import './styles.scss';

interface IProduct {
	id: number;
	image: string;
	title: string;
	price: number;
	description: string;
	category: string;
}
export const ProductsGrid: React.FC = () => {
	const [products, setProducts] = useState<IProduct[]>([]);

	useEffect(() => {
		fetch('https://fakestoreapi.com/products')
			.then(res => res.json())
			.then(data => {
				setProducts(data);
			});
	}, []);

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
