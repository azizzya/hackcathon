import { BackArrowSVGComponent } from '@/shared/ui/SVGs/BackArrow.SVG.Component';
import { useNavigate } from 'react-router-dom';
import './styles.scss';
export const BackArrowButton: React.FC = () => {
	const navigate = useNavigate();
	return (
		<div className='backArrow-svg-container' onClick={() => navigate('/menu')}>
			<BackArrowSVGComponent />
		</div>
	);
};
