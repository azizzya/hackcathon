import '@/shared/ui/shared.scss';
import './styles.scss';
interface IProductCardProps {
	image: string;
	name: string;
	price: number;
}

export const ProductCard: React.FC<IProductCardProps> = ({
	image,
	name,
	price,
}) => {
	return (
		<div className='card-wrapper'>
			<img src={image} alt='product_image' />
			<div className='product-info-block'>
				<div className='price'>{`${price} c`}</div>
				<div className='name'>{name}</div>
				<button className='buy-button'>Купить</button>
			</div>
		</div>
	);
};
