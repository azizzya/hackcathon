import { AuthForm } from './Form';
import './styles.scss';
export const AuthPlate: React.FC = () => {
	return (
		<div className='upper-auth-wrapper'>
			<div className='auth-wrapper'>
				<div className='auth-title'>Авторизация</div>
				<AuthForm />
			</div>
		</div>
	);
};
