import { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import { IServiceCardProps } from '../model/interfaces';

export const ServiceCard: React.FC<IServiceCardProps> = ({
	text,
	SVGComponent,
	label,
}) => {
	const navigate = useNavigate();

	const [fillColor, setFillColor] = useState('white');

	const onClickHandler = () => {
		setFillColor('#6C33FF');
		navigate(`/menu/${label}`);
	};

	return (
		<button className='primary-button' onClick={onClickHandler}>
			<div className='menu-button-content-container'>
				<div className='menu-button-content-container-img'>
					<SVGComponent fillColor={fillColor} width='28px' height='28px'/>
				</div>
				<div className='menu-button-content-container-text'>{text}</div>
			</div>
		</button>
	);
};
