import { AuthForm } from './Form';
import './styles.scss';
export const AuthPlate: React.FC = () => {
	return (
		<div className='wrapper'>
			<p>Авторизация</p>
			<AuthForm />
		</div>
	);
};
