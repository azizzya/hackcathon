export interface IProductGridProps {
	products: IProduct[];
}

export interface IProduct {
	id: number;
	image: string;
	title: string;
	price: number;
	description: string;
	category: string;
}
