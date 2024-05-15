import { BackArrowButton } from '@/features/BackArrowButton';
import { ChatInput } from '@/widgets/ChatInput';

export const ChatPage: React.FC = () => {
	return (
		<div className='page-wrapper'>
			<header className=''>
				<BackArrowButton />
			</header>
			<ChatInput />
		</div>
	);
};
