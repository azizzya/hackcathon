import { AuthForm } from './Form';
import './styles.scss';
export const AuthPlate: React.FC = () => {
	return (
		<div className='auth-wrapper'>
			<p>Авторизация</p>
			<AuthForm />
		</div>
	);
};
