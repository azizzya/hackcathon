import { useQuery } from '@tanstack/react-query';

export function useLeaderBoardUsers() {
	return useQuery({
		queryFn: () => console.log('penis'),
		queryKey: ['users', 'leaderBoard'],
	});
}
