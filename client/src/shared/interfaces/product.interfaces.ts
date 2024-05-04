export interface IProduct {
	id: number;
	name: string;
	description: string;
	price: number;
	category: string;
}

export interface IProductResponse {
	data: IProduct[];
}
