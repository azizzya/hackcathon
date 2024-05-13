import { useState } from 'react';
import { IProduct } from '../model/interfaces';

export function useProducts() {
	const [products, setProducts] = useState<IProduct[]>([]);

	fetch('https://fakestoreapi.com/products')
		.then(res => res.json())
		.then(data => {
			setProducts(data);
		});

	return { data: products };
}
