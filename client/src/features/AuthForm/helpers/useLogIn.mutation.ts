import { authService } from '@/shared/api/auth.service';
import { IUserLogIn } from '@/shared/interfaces/user.interfaces';
import { useMutation } from '@tanstack/react-query';
import { useNavigate } from 'react-router-dom';

export function useLogInMutation() {
	const navigate = useNavigate();
	return useMutation({
		mutationFn: (user: IUserLogIn) => authService.logIn(user),
		mutationKey: ['login'],
		onSuccess: () => navigate('/main'),
		onError: () => alert('error'), //делать
	});
}
