export interface IProduct {
	item_id: number;
	// image: string;
	name: string;
	description: string;
	price: number;
	category: string;
}

export interface IProductResponse {
	data: IProduct[];
}
