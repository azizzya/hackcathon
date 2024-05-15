import { SendArrowSVGComponent } from '@/shared/ui/SVGs/SendArrow.SVG.Component';
import './styles.scss';
export const ChatInput: React.FC = () => {
	return (
		<div className='chat-input-wrapper'>
			<input className='chat-input-input' placeholder='Сообщение' />
			<div className='chat-input-img-container'>
				<SendArrowSVGComponent width='30px' height='25px' />
			</div>
		</div>
	);
};
